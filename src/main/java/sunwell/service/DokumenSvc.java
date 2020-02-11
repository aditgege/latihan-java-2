package sunwell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sunwell.entity.Dokumen;
import sunwell.repository.DokumenRepo;

/**
 * @author Aditia Dwi
 */
@Service
public class DokumenSvc
{
    @Autowired
    DokumenRepo repo;

    @Transactional
    public void createNewDokumen(Dokumen dok)
    {
        System.out.println("createNewDokumen() ENTER");
        repo.save(dok);
        System.out.println("dok saved ");
    }
}
