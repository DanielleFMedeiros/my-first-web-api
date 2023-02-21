package dio.web.api.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Usuario implements List<Usuario> {
    private Integer id;
    private String login;
    private String password;
    public Usuario(){}
    public Usuario(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString(){
        return "User{" +
                "login ='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';

        
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public boolean add(Usuario arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void add(int arg0, Usuario arg1) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean addAll(Collection<? extends Usuario> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean addAll(int arg0, Collection<? extends Usuario> arg1) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean contains(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Usuario get(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int indexOf(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Iterator<Usuario> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int lastIndexOf(Object arg0) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public ListIterator<Usuario> listIterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public ListIterator<Usuario> listIterator(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean remove(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Usuario remove(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean removeAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean retainAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public Usuario set(int arg0, Usuario arg1) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public List<Usuario> subList(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public <T> T[] toArray(T[] arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
