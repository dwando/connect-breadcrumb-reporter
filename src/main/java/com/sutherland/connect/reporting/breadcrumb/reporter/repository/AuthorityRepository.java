package com.sutherland.connect.reporting.breadcrumb.reporter.repository;

import com.sutherland.connect.reporting.breadcrumb.reporter.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
