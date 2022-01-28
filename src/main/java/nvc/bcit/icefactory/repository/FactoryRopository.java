package nvc.bcit.icefactory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.icefactory.model.Factory;

public interface FactoryRopository extends JpaRepository<Factory, Integer> {
    
}
