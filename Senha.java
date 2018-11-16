package ProjetoAldo.sample;


import java.util.EmptyStackException;

class LinkedIntList{
    public class Senha {
        long senh;
        void gerarSenha(long senha){
            double numero = Math.random();
            senha = Math.round(numero);
            this.senh = senha;
        }

        int val;
        Senha next;
        Senha cursor;
        Senha prev;

        Senha(int v, Senha n) {
            val = v;
            next = n;
        }
    }


    private Senha first;
    private Senha prev;
    private  int size;

    LinkedIntList(){
        first = null;
        size = 0;
    }
    LinkedIntList(LinkedIntList l){
        first = l.getFirst();
        size = l.size();
    }
    Senha getFirst(){return first;}
    boolean emptu(){return size ==0;}
    int size(){return size;}

    void print(){
        Senha cursor = first;
        while (cursor != null){
            System.out.println(cursor.val + size);
            cursor = cursor.prev;
        }
    }

    int indexOf(int v){
        int index = 0;
        Senha cursor;
        for (cursor = first; cursor != null && cursor.val != v; cursor = cursor.next){
            index++;
        }
        if (cursor ==null) index = -1;
        return index;
    }

    void addFirst(int v){
        first = new Senha(v, first);
        size++;
    }
    void add(int v, int index){
        if (index ==0){
            first = new Senha(v, first);
        }
        else {
            Senha cursor = first;
            for (int i = 0; i < index - 1; i++)cursor = cursor.next;
            cursor.next = new Senha(v, cursor.next);
        }
        size++;
    }
    void removeFirst(){
        first = first.next;
        size--;
    }
    int get(int index){
        Senha cursor = first;
        for (int i = 0; i < index; i++)
            cursor = cursor.next;
        return cursor.val;
    }

    void remove(int index){
        if(index == 0){
            first = first.next;
        }else{
            Senha cursor = first;
            for (int i = 0; i < index; i++){
                cursor = cursor.next;
                cursor.next = cursor.next.next;
            }
        }
        size--;
    }

}
