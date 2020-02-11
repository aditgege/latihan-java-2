package sunwell.http.controller;

import org.springframework.web.bind.annotation.*;
import sunwell.http.res.json.AddressResp;
import sunwell.http.res.json.PersonResp;

import java.util.*;

/**
 *
 * @author Aditia Dwi
 */
@RestController
public class PersonCtrl
{
    @ResponseBody
    @GetMapping("/person/{id}")
    public PersonResp findById(
            @PathVariable("id") int id
    )
    {
        PersonResp response = new PersonResp();
        response.setFullname("aditia dwi");

        Date birthdate = Calendar.getInstance().getTime();  // jam skr
        response.setBirthdate(birthdate);
        response.setBirthplace("bandung");
        response.setBloodtype("O");

        AddressResp addressResp = new AddressResp();
        addressResp.setCity("Kota Bandung");
        addressResp.setCountry("Indonesia");
        addressResp.setStreet("Jl. Kiaracondong");

        LinkedList<AddressResp> listAddr = new LinkedList();
        listAddr.add(addressResp);

        addressResp = new AddressResp();
        addressResp.setCity("Kota Bandung");
        addressResp.setCountry("Indonesia");
        addressResp.setStreet("Jl. Setraduta Ciumbuleuit");
        listAddr.add(addressResp);

        response.setAddresses(listAddr);

        return response;
    }

    @GetMapping("/persons")
    public List<PersonResp> getAll()
    {
        ///////////////////////////////
        PersonResp p1 = new PersonResp();
        p1.setFullname("aditia dwi");

        Date birthdate = Calendar.getInstance().getTime();  // jam skr
        p1.setBirthdate(birthdate);
        p1.setBirthplace("bandung");
        p1.setBloodtype("O");

        AddressResp addressResp = new AddressResp();
        addressResp.setCity("Kota Bandung");
        addressResp.setCountry("Indonesia");
        addressResp.setStreet("Jl. Kiaracondong");

        LinkedList<AddressResp> listAddr = new LinkedList();
        listAddr.add(addressResp);
        p1.setAddresses(listAddr);
        ///////////////////////////////


        ///////////////////////////////
        PersonResp p2 = new PersonResp();
        p2.setFullname("irfin afifudin");

        birthdate = Calendar.getInstance().getTime();  // jam skr
        p2.setBirthdate(birthdate);
        p2.setBirthplace("Ujungpandang");
        p2.setBloodtype("O");

        addressResp = new AddressResp();
        addressResp.setCity("Kota Bandung");
        addressResp.setCountry("Indonesia");
        addressResp.setStreet("Jl. Pinus Raya");

        LinkedList<AddressResp> addrP2 = new LinkedList();
        addrP2.add(addressResp);
        p2.setAddresses(addrP2);
        ///////////////////////////////

        List<PersonResp> response = new LinkedList();
        response.add(p1);
        response.add(p2);

        return response;
    }

    @ResponseBody
    @PostMapping("/person/{id}")
    public PersonResp updatePerson(
            @PathVariable("id") int id,
            @RequestBody() PersonResp person
    )
    {
        person.setFullname("James Bond");
        person.setBloodtype("A+");

        Iterable<AddressResp> addresses = person.getAddresses();
        AddressResp addr = addresses.iterator().next();
        addr.setStreet("Ibrahim Adjie");

        return person;
    }
}
