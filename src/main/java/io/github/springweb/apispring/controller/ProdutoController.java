package io.github.springweb.apispring.controller;

import io.github.springweb.apispring.model.Produto;
import io.github.springweb.apispring.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController // Usamos isso para tornar a classe gerenciada pelo Spring Boot
@RequestMapping("produtos")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    // Criamos o construtor e injetamos o repository
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        // Para fins de log no console
        System.out.printf("Produto recebido: " + produto);
        // Criamos um Universal Unique Identifier e atribuímos à variável id.
        var id = UUID.randomUUID().toString();
        // Chamamos o set do Model e definimos o ID
        produto.setId(id);
        produtoRepository.save(produto);

        return produto;
    }

    // É possível passar quantos parâmetros forem necessários pelo method
    // @GetMapping("/{id}/{nome}/outrovalor")
    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        // return produto.isPresent() ? produto.get() : null;
        // Abordagem alternativa usando o Optional de forma avançada
         return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }
}
