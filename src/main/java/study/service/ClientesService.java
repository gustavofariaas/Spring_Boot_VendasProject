package study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.model.Cliente;
import study.repository.ClientesRepository;

@Service
public class ClientesService {

    private ClientesRepository repository;

//    Nao e necessario o AutoWired, pois o pacote ja reconhece que a classe eh @Service e reconhece que ClientesRepository eh @Repository
    @Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
//        ClientesRepository repository = new ClientesRepository();  **PRECISA DE INJEcao DE DEPENDENCIA, pode quebrar**
        repository.persistir(cliente);
    }

    private void validarCliente(Cliente cliente) {
//        Validar cliente
    }
}
