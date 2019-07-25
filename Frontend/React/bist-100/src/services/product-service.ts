import axios, { AxiosResponse } from 'axios';
import { IProductModel } from '../models/IProductModel';
export class ProductService{

    static baseUrl="https://www.jsonstore.io/2bce63b869ccae0ebf6206436696a1cd38052c5aad805242cb43af3fee72abc6"
    
    constructor(){
        Object.freeze(ProductService.baseUrl);
    }
    read=():Promise<IProductModel>=>{
        let resultPromise = new Promise<IProductModel>((resolve,reject)=>{
            axios.get(ProductService.baseUrl)
            .then(r=>resolve(r.data))
            .catch(e=>reject(e));
        });
        return resultPromise;
    }
}