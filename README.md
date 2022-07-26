# Kajon ohjelmatietokannan hallintamoduuli

Kajo 2022 ohjelman tietokannan hallintamoduuli. Tarjoaa perustason CRUD-toiminnot MySQL-pohjaisen ohjelma-tietokannan hallintaan. 

## Tietokanta
MySQL-tietokanta

### Main
>  Kenttä | Tyyppi | Kuvaus 
>  ------ | ------ | -----  
> ohjelma_id | autonumber | 
> otsikko | string | tapahtuman otsikko 
> start | datetime | alkuaika
> end | datetime | loppuaika
> paikka | string | tapahtuman paikka
> kategoria | string | FK tapahtuman kategoria
> alaleiri | string | FK kohdennettava alaleiri (jos on)
> ikakausi | string | FK ikakausi tai kaikki
> aalto | int | 1 / 2
> internal_desc | string | kuvaus tapahtumasta
> leiri_app | bool/int | näkyykö sovelluksessa
> lisatieto | string | keneltä lisätietoja
> osa_alue | string | FK minkä osa-alueen alla
> ryhma | string | FK minkä ryhmän alla
> pvm | date | calculated from start

### Muut taulut
Muut taulut toteutettiin string tyyppisinä, joissa oli vain yksi kenttä perustuen alkuperäiseen datasettiin:
> Kategoria
> Alaleiri
> Ikakausi
> Osa_alue
> Ryhma 

## Huomioitavaa
Forkatessa ja uudelleenkäytössä vaaditaan oman UserDetailsServicen luomista tai muuta vastaavaa ratkaisua.