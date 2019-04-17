import { TargetMarket } from '../targetMarket/target-market';
import { Stack } from '../stack/stack';

export class Product {
    public name:string
    public description:string
    public targetMarket:TargetMarket[]
    public stack:Stack[]
}
