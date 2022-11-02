package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
@Getter
@Setter
@Data
@AllArgsConstructor  //--parametrelerden oluşan cons için  
@NoArgsConstructor  //parametresiz oluşan cons için 
@Entity //sen bir veritabanı varlığısın demek
public class Brand {
	
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id si bir bir artan demek
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	

	/*
	 * public Brand() { } public Brand(int id, String name) { this.id = id;
	 * this.name = name; } public int getId() { return id; } public void setId(int
	 * id) { this.id = id; } public String getName() { return name; } public void
	 * setName(String name) { this.name = name; }
	 */
}
