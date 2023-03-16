package fr.simplon.aeronefback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.simplon.aeronefback.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}