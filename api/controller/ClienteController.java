package br.dev.matheus.OSApiApplication.api.controller;

import br.dev.matheus.OSApiApplication.domain.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    List<Cliente> listaClientes;
    
    @GetMapping("/clientes")
    public List<Cliente> listas() {
        
        listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente (1, "Neymar", "Ney@santosfc.com", "15-99443-4500"));
        listaClientes.add(new Cliente (1, "Messi", "Lionel@intermiamisc", "34-96453-0231"));
        listaClientes.add(new Cliente (1, "Suarez", "Luisito@gremiofc", "92-98843-8429"));
        
        return listaClientes;
    }
}
