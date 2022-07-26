export class Skills {

    id?: number;
    nombreS: string;
    porcentajeS: string;
    imagenS : string;

    constructor(nombreS: string, porcentajeS: string, imagenS: string) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
        this.imagenS = imagenS;
    }
}
