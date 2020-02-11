/*
 * ${NAME}
 * Created on 2/10/20, 4:32 PM
 *
 * Copyright (c) 2020. Sunwell System CV, Bandung, Indonesia.
 */

package sunwell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sunwell.entity.*;
import sunwell.repository.HewanRepository;

import java.util.List;

/**
 * @author Aditia Dwi
 */
@RestController
public class HewanCtrl
{
    @Autowired
    private HewanRepository hewanRepo;

    @GetMapping("/hewan")
    public Iterable<Hewan> getAll()
    {
        return hewanRepo.findAll();
    }

    @PostMapping("/burungsuper")
    public Hewan createBurungSuper(
            @RequestParam(name = "name" ) String name,
            @RequestParam(name = "jmlkaki") int jmlKaki,
            @RequestParam(name = "isamfibi") boolean isAmfibi,
            @RequestParam(name = "bisaterbang") boolean bool,
            @RequestParam(name = "kekuatan") String kekuatan
    )
    {
        BurungSuper b = new BurungSuper();
        b.setNama(name);
        b.setJmlKaki(jmlKaki);
        b.setAmfibi(isAmfibi);
        b.setBisaTerbang(bool);
        b.setKekuatan(kekuatan);

        hewanRepo.save(b);

        return b;
    }

    @PostMapping("/burung")
    public Hewan createBurung(
            @RequestParam(name = "name" ) String name,
            @RequestParam(name = "jmlkaki") int jmlKaki,
            @RequestParam(name = "isamfibi") boolean isAmfibi,
            @RequestParam(name = "bisaterbang") boolean bool
    )
    {
        Burung b = new Burung();
        b.setNama(name);
        b.setJmlKaki(jmlKaki);
        b.setAmfibi(isAmfibi);
        b.setBisaTerbang(bool);

        hewanRepo.save(b);

        return b;
    }

    @PostMapping("/kadal")
    public Hewan createKadal(
            @RequestParam(name = "name" ) String name,
            @RequestParam(name = "jmlkaki") int jmlKaki,
            @RequestParam(name = "isamfibi") boolean isAmfibi,
            @RequestParam(name = "warna") String warna
    )
    {
        Kadal k = new Kadal();
        k.setNama(name);
        k.setJmlKaki(jmlKaki);
        k.setAmfibi(isAmfibi);
        k.setWarna(warna);

        hewanRepo.save(k);

        return k;
    }

}
