package com.js.petclinic.bootstrap;

import com.js.petclinic.model.Owner;
import com.js.petclinic.model.Vet;
import com.js.petclinic.services.OwnerService;
import com.js.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {

        Owner owner1 = new Owner();
        owner1.setName("Jovan");
        owner1.setSurname("Stepanovic");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setName("Mia");
        owner2.setSurname("Gasic");
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setName("Misko");
        vet1.setSurname("Simovic");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setName("Marko");
        vet2.setSurname("Prelac");
        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
