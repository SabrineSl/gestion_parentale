/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Prof;

/**
 *
 * @author sabrine
 */
public class ProfService extends AbstractFacade<Prof>{
    
    public ProfService() {
        super(Prof.class);
    }
      public int seConnecter(Prof prof){
        Prof loadedProf = find(prof.getId());
        if (loadedProf==null){
            return -1;
        }else if(!loadedProf.getPassword().equals(prof.getPassword())){
            return -2;
        }else {
            return 1;
        }
    }
    
    
}
