export class Proyectos {
    id? : number;
    nombrePro: string;
    descripcionPro: string;
    fechaPro: string;

    constructor(nombrePro: string, descripcionPro:string, fechaPro:string){
        this.nombrePro= nombrePro;
        this.descripcionPro= descripcionPro;
        this.fechaPro= fechaPro;
    }
}
