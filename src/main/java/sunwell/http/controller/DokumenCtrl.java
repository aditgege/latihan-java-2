package sunwell.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sunwell.entity.Dokumen;
import sunwell.repository.DokumenRepo;
import sunwell.service.DokumenSvc;

import java.util.List;

/**
 * @author Aditia Dwi
 */
@RestController
@RequestMapping("/dokumen")
public class DokumenCtrl
{

    @Autowired
    DokumenSvc svc;

    @PostMapping
    public String add(@RequestBody Dokumen dok)
    {
        svc.add(dok);
        return "Success";
    }

    @GetMapping
    public List<Dokumen> getDokumen()
    {
        return svc.getDokumens();
    }

    @GetMapping("/{id}")
    public Dokumen getById(@PathVariable(required = true) int id) {
        return svc.getDokById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable(required = true) int id)
    {
        svc.delete(id);
        return "Success";
    }

    @PatchMapping("/{id}")
    public String update(
            @RequestBody Dokumen dok,
            @PathVariable(required =  true) int id)
    {
        svc.update(id,dok);

        return "success";
    }

}
