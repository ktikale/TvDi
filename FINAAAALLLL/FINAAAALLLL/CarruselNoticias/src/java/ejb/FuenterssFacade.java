/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Fuenterss;

/**
 *
 * @author johanna
 */
@Stateless
public class FuenterssFacade extends AbstractFacade<Fuenterss> {
    @PersistenceContext(unitName = "CarruselNoticiasPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public FuenterssFacade() {
        super(Fuenterss.class);
    }

}
