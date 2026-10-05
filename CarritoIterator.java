import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarritoIterator<T> implements Iterator<T> {
    int indice = 0;
    List<T> lista;

    public CarritoIterator(List<T> Lista) {
        this.lista = Lista;
    }

    @Override
    public boolean hasNext() {
        return indice < lista.size();
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new NoSuchElementException();
        T t = lista.get(indice);
        indice++;
        return t;
    }

    public boolean tieneParaAtras() {
        return indice >= 0;
    }

    public T deparaAtras() {

        if (!tieneParaAtras()) {
            throw new NoSuchElementException("NO hay elementos");
        }
        T t = lista.get(indice);
        indice--;
        return t;
    }

    public boolean hasNextSalto() {
        if ((indice + 2 < lista.size())) {
            return true;
        } else
            return false;
    }

    public T saltarNext() {

        if (!(indice + 2 <= lista.size())) {
            throw new NoSuchElementException("NO hay elementos");
        }

        T t = lista.get(indice);
        indice += 2;
        return t;

    }

    public boolean hasNextImpar() {

        int proximoIndice = (indice == 0) ? 1 : indice;
        return proximoIndice < lista.size();
    }

    public T nextImpar() {
        if (!hasNextImpar()) {
            throw new NoSuchElementException("No hay más elementos en posiciones impares");
        }

        if (indice == 0) {
            indice = 1;
        }

        T t = lista.get(indice);
        indice += 2;
        return t;
    }

}
