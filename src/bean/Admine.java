/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author sabrine
 */
@Entity
public class Admine implements Serializable {

    @OneToMany(mappedBy = "admin")
    private List<Prof> profs;

    @OneToMany(mappedBy = "admin")
    private List<Matiere> matieres;

    @OneToMany(mappedBy = "admin")
    private List<Eleve> eleves;
    @OneToMany(mappedBy = "admin")
        private List<Classe> classes;
  @OneToMany(mappedBy = "admin")
    private List<Evenement> evenements;
    @Id
    private String id;
    private String password;
  

    public Admine() {
    }

    public Admine(String id) {
        this.id = id;
    }

    public Admine(String id, String password) {
        this.id = id;
        this.password = password;
    }
    


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  

    public List<Prof> getProfs() {
        return profs;
    }

    public void setProfs(List<Prof> profs) {
        this.profs = profs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }

    public List<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admine)) {
            return false;
        }
        Admine other = (Admine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    public List<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(List<Eleve> eleves) {
        this.eleves = eleves;
    }

    @Override
    public String toString() {
        return "Admine{" + "id=" + id + ", password=" + password + '}';
    }

   
}
