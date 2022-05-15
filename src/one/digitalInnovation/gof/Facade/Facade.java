package one.digitalInnovation.gof.Facade;

import one.digitalInnovation.gof.Subsistema1crm.CrmService;
import one.digitalInnovation.gof.Subsistema2cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
