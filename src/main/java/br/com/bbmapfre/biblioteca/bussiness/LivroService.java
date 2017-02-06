package br.com.bbmapfre.biblioteca.bussiness;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.bbmapfre.biblioteca.model.Livro;

@Stateless
public class LivroService {

	@PersistenceContext
	private EntityManager em;
	
	public List<Livro> consultarLivros() {
		Livro l = new Livro();
		
		l.setId(1L);
		l.setNome("Livro Teste");
		l.setUrlImagem("http://URL.TESTE");
		
		em.persist(l);
		
		List<Livro> listaLivros = 
				em.createQuery("select l from Livro l", Livro.class).getResultList();
		
		//List<Livro> listaLivros = new ArrayList<Livro>();
		//listaLivros.add(l);
		
        return listaLivros;
	}
}
