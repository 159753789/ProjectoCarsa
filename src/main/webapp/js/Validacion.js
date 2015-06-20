/**
 * Created by lazaroguerra on 20/06/2015.
 */

function verificar (patron,elemento){
    if(!patron,test(elemento.value)){
        elemento.value='';
        elemento.focus();
    }
}