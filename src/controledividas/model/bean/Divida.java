/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledividas.model.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author Edmilson Rolas
 */
public class Divida implements Serializable{
    private String id;
    private String nomeDevedor;
    private String apelidoDevedor;
    private String data;
//    private Date dataPagamento;
    private double valorDivida;
    private double valorAPagar;
    private Status status;
    
    public enum Status {
        PAGA, NÃO_PAGA
    }

    public Divida(String nomeDevedor, String apelidoDevedor, String data, double valorDivida, double valorAPagar) {
        this.id = UUID.randomUUID().toString();
        this.nomeDevedor = nomeDevedor;
        this.apelidoDevedor = apelidoDevedor;
        this.data = data;
        this.valorDivida = valorDivida;
        this.valorAPagar = valorAPagar;
        this.status = Status.NÃO_PAGA;
    }

    public String getId() {
        return id;
    }

    public String getNomeDevedor() {
        return nomeDevedor;
    }

    public String getApelidoDevedor() {
        return apelidoDevedor;
    }

    public String getData() {
        return data;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

//    public void setDataPagamento(Date dataPagamento) {
//        this.dataPagamento = dataPagamento;
//    }


    @Override
    public String toString() {
        return "\nDivida{" + "id=" + id + ", nomeDevedor=" + nomeDevedor + ", apelidoDevedor=" + apelidoDevedor + ", data=" + data + ", valorDivida=" + valorDivida + ", valorAPagar=" + valorAPagar + ", status=" + status + '}';
    }

}
