package model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Locacao {

    private int id;

    private LocalDate dataLocacao;

    private Time horaLocacao;

    private LocalDate DataDevolucao;

    private Time horaDevolucao;

    private int quilometragem;

    private Double valorCalcao;

    private Boolean devolvido;

    public Locacao() {
    }

    public Locacao(int id, LocalDate dataLocacao, LocalTime horaLocacao, LocalDate dataDevolucao, LocalTime horaDevolucao, int quilometragem, Double valorCalcao, Boolean devolvido) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.horaLocacao = Time.valueOf(horaLocacao);
        this.DataDevolucao = dataDevolucao;
        this.horaDevolucao = Time.valueOf(horaDevolucao);
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.devolvido = devolvido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Time getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(Time horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public LocalDate getDataDevolucao() {
        return DataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        DataDevolucao = dataDevolucao;
    }

    public Time getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Time horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(Double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public Boolean getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(Boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "\nLocacao{" +
                "id=" + id +
                ", dataLocacao=" + dataLocacao +
                ", horaLocacao=" + horaLocacao +
                ", DataDevolucao=" + DataDevolucao +
                ", horaDevolucao=" + horaDevolucao +
                ", quilometragem=" + quilometragem +
                ", valorCalcao=" + valorCalcao +
                ", devolvido=" + devolvido +
                '}';
    }
}
