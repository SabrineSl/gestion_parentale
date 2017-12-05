/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Parent;

/**
 *
 * @author sabrine
 */
public class ParentService extends AbstractFacade<Parent>{
    
    public ParentService() {
        super(Parent.class);
    }
      public int seConnecter(Parent parent){
        Parent loadedParent = find(parent.getId());
        if (loadedParent==null){
            return -1;
        }else if(!loadedParent.getPassword().equals(parent.getPassword())){
            return -2;
        }else {
            return 1;
        }
    }
      
    
}
