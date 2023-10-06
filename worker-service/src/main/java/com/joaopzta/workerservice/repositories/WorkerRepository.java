package com.joaopzta.workerservice.repositories;

import com.joaopzta.workerservice.entities.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
