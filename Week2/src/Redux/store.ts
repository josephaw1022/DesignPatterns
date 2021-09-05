
import {store} from "redux"


const bookStore = (state:any , action:any) => { 
    switch (action.type) {
        case 'Update':
          return [...state, action?.payload]
        default: 
          return state
      } 
}


export const Store = store(bookStore) 