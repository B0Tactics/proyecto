package edu.eci.arsw.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

	private String email;

	private String user;
	
	private String password;
        
        private ArrayList<Integer> puntajes ;

    public ArrayList<Integer> getPuntajes() {
        return puntajes;
    }
    public void addPuntaje(Integer in){
        puntajes.add(in);
    }
    public void setPuntajes(ArrayList<Integer> puntajes) {
        this.puntajes = puntajes;
    }
        
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user){
		this.user=user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}
}
