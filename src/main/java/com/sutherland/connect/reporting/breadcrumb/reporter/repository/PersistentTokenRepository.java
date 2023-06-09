package com.sutherland.connect.reporting.breadcrumb.reporter.repository;

import com.sutherland.connect.reporting.breadcrumb.reporter.domain.PersistentToken;
import com.sutherland.connect.reporting.breadcrumb.reporter.domain.User;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link PersistentToken} entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {
    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);
}
