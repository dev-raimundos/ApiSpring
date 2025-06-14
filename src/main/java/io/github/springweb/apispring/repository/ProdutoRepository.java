package io.github.springweb.apispring.repository;

import io.github.springweb.apispring.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
/* OBS:
 * A JpaRepository oferece métodos prontos para operações de CRUD e suporte para paginação e ordenação.
 */

// Passamos o Model ¹Produto e a ²PrimaryKey de sua classe como parâmetros.
public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
