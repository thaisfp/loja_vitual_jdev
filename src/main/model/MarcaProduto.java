import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "marca_produto")
@SequenceGenerator(name = "seq_marca_prodto", sequenceName = "seq_marca_prodto", allocationSize = 1, initialValue = 1)
public class MarcaProduto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_prodto")
    private Long id;

    @Column(nullable = false)
    private String nomeDesc;
}
