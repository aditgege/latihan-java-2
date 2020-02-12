package sunwell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sunwell.entity.Dokumen;
import sunwell.repository.DokumenRepo;

import java.util.List;
import java.util.Optional;

/**
 * @author Aditia Dwi
 */
@Component
public class DokumenSvc
{
    @Autowired
    DokumenRepo repo;

    @Transactional
    public void add(Dokumen dok)
    {
        System.out.println("createNewDokumen() ENTER");
        repo.save(toEntity(dok));
        System.out.println("dok saved ");
    }

    public List<Dokumen> getDokumens() {
        return (List<Dokumen>) repo.findAll();
    }

    public Dokumen getDokById(int id)
    {
        Optional<Dokumen> optionalDokumen = repo.findById(id);
        return optionalDokumen.orElseThrow(() -> new NotFounfExceptions(id+ "dokumen tidak ada"));
    }

    public void delete(int id)
    {
        repo.deleteById(id);
    }

    public void update(int id, Dokumen dok)
    {
        Dokumen dokDb = getDokById(id);
        dokDb.setIsi(dok.getIsi());
        dokDb.setHewan_id(dok.getHewan_id());

        repo.save(dokDb);
    }

    private Dokumen toEntity(Dokumen dok)
    {
        Dokumen entity = new Dokumen();
        entity.setIsi(dok.getIsi());
        entity.setHewan_id(dok.getHewan_id());
        return entity;
    }

}
