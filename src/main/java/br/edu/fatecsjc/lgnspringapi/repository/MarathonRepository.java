package br.edu.fatecsjc.lgnspringapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecsjc.lgnspringapi.entity.Marathon;

public interface MarathonRepository extends JpaRepository<Marathon, Long> {
}