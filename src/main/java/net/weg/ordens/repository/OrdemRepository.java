package net.weg.ordens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemRepository<T> extends JpaRepository<T, Integer> {

}
