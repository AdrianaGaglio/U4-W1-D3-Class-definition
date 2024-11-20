package esercizio3;

import java.util.Date;

public class Cliente {
    private String codiceCliente;
    private String nomeCognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(String codiceCliente, String nomeCognome, String email, Date dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodiceCliente() {
        return this.codiceCliente;
    }

    public String getNomeCognome() {
        return this.nomeCognome;
    }

    public String getEmail() {
        return this.email;
    }

    public Date getDataIscrizione() {
        return this.dataIscrizione;
    }


}
