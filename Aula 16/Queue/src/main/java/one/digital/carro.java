package one.digital;

import java.util.Objects;

public class carro {
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    String marca;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        carro carro = (carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(marca);
    }

    public carro(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
