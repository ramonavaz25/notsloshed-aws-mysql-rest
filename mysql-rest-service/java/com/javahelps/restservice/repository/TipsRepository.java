package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.Tip;


@RepositoryRestResource(path = "/tips")
public interface TipsRepository extends JpaRepository<Tip, String> {

}