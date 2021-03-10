package oblig.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {

    private final List<Billett> alleBilletter = new ArrayList<>();

    @PostMapping("lagre")
    public void lagreBillett(Billett innbillett){
        alleBilletter.add(innbillett);
        System.out.println(innbillett);
    }

    @GetMapping("billetter")
    public List<Billett> hentAlle(){
        return alleBilletter;
    }

    @GetMapping("/slett")
    public void slettAlle(){
        alleBilletter.clear();
    }
}
