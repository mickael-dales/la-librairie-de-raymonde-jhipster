export interface IBook {
  id?: number;
  title?: string;
  resume?: string;
  imageUrl?: string;
  isbn?: number;
}

export const defaultValue: Readonly<IBook> = {};
