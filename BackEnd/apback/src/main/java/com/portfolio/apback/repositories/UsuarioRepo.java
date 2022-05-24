
package com.portfolio.apback.repositories;

import com.portfolio.apback.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    
}
