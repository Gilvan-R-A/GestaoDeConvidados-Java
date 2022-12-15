package com.empresa.gestaofesta.repository;

import com.empresa.gestaofesta.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado, Long> {
}
