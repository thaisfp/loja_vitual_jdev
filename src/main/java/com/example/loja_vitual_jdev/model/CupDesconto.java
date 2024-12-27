package com.example.loja_vitual_jdev.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.example.loja_vitual_jdev.enums.TipoEndereco;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "cupDesconto")
@SequenceGenerator(name = "seq_cupDesconto", sequenceName = "seq_cupDesconto", allocationSize = 1, initialValue = 1)
public class CupDesconto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cupDesconto")
    private Long id;

    private String codDesc;

    private BigDecimal valorRealDesc;

    private BigDecimal valorPorcentagemDesc;

    @Temporal(TemporalType.DATE)
    private Date dtValidadeCupom;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CupDesconto other = (CupDesconto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    
    
}
