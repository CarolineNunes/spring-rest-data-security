package br.edu.fatecsjc.lgnspringapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecsjc.lgnspringapi.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}