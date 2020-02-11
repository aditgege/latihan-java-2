package sunwell.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sunwell.entity.Dokumen;
import sunwell.repository.DokumenRepo;
import sunwell.service.DokumenSvc;

/**
 * @author Aditia Dwi
 */
@RestController
public class DokumenCtrl
{

    @Autowired
    DokumenRepo repo;
    DokumenSvc svc;

    @PostMapping("/dokumen")
    public String createDok(
            @RequestParam(name = "isi") String isi,
            @RequestParam(name = "hewan_id") int hwid
    )
    {
        Dokumen dok = new Dokumen();
        dok.setIsi(isi);
        dok.setHewan_id(hwid);
        DokumenSvc svc = new DokumenSvc();
        svc.createNewDokumen(dok);
        return "Sukses";
    }
}
