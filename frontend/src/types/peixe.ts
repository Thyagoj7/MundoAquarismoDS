export type Peixe = {
    id: number;
    Nome:string;
    Especie: string;
    NomeCientifico: string;
    Aquario: number;
    Continente: string;
    Pais: string;
    TipoAgua: string;
    Alimentacao: string;
    TamanhoPeixe: DoubleRange;
    Informacao: String;
    image: string;

}

export type PeixePage = {
    content: Peixe[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}