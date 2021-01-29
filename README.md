# Sujet

**Bataille navale** :ship: :speedboat: :sailboat:

https://slides.com/gpuget/extreme-programming/

## User stories

### Première version : Description

| Id | En tant que ... | Je veux ... | Pour ... | Valeur métier |
|---|---|---|---|---|
|1|Joueur|Connaître ses bateaux|Les placer sur le plateau de jeu|xxx|  |
|2|Joueur|Voir le plateau de jeu|Placer ses bateaux|xxx|
|3|Joueur|Choisir le prochain coup|Toucher un bateau adverse|xxx|
|4|Joueur|Voir où a tiré l'adversaire|Savoir s'il touche un de mes bateaux|xxx|
|5|Spectateur|Voir les deux maps|Suivre le cours de la partie|xxx|
|6|Joueur|Placer un bateau|Initialiser la partie|xxx|
|7|Joueur|Pouvoir sélectionner le nombre de joueurs |Choisir mon mode de jeu (vs IA ou Joueur)|xxx|
|8|Joueur|Ne pas voir le placement des bateaux de l'adversaire|Préserver le game-play|xxx|
|9|Joueur|Savoir si toutes les parties d'un bateau ont été touchées|Savoir si le bateau a été coulé|xxx|
|10|Joueur|Déterminer si tous les bateaux de l'adversaire sont coulés|savoir si j'ai gagné|xxx|
|11|Joueur|Savoir si j'ai touché un bateau|Guider mes prochains coups|xxx|
|12|Joueur|Rejoindre la partie|Jouer contre un adversaire|xxx|
|13|Joueur|Distinction tir touché ou manqué sur la map|Choisir mon prochain tir|xxx|
|14|Joueur|Voir le nombre de parties que j'ai gagnées ou perdues|Suivre mon score|xxx|
|15|Joueur|Commencer une nouvelle série de partie|Remettre les scores à zéro|xxx|
|16|Joueur|Quitter une partie en cours|**Ragequit** et arrêter de jouer|xxx|
|17|Spectateur|Rejoindre une partie en cours|Suivre le match|xxx|
|18| Adversaire | jouer après joueur (ou l'IA) | alterner les joueurs | xxx |
|19| Joueur | gagner un point lorsque je touche un bateau ennemi | gagner la partie | xxx |
|20| Joueur | Voir là où j'ai tiré | Choisir mon prochain tir | xxx |

### Deuxième version : INVEST

| Id | En tant que ... | Je veux ... | Pour ... | INVEST check |
|---|---|---|---|---|
|12|Joueur|Rejoindre une partie active|Jouer contre un adversaire|INVE-T|
|25| joueur | ne pas pouvoir rejoindre une partie déjà active | ne pas déranger la partie | INVEST | 
|13|Joueur|attendre l'adversaire en mode "multijoueur" | pour commencer la partie|-NVEST|
|17|Spectateur|Rejoindre une partie en cours|Suivre le match|INVE-T|
|7|Joueur|Sélectionner le mode "Contre IA" |jouer contre une IA|INVEST|
|71|Joueur|Sélectionner le mode "Multijoueur" |jouer avec d'autres humains|INVEST|
|21|Joueur|Pouvoir sélectionner la taille de la grille|Choisir la taille|IN-EST|
|---|---|---|---|---|---|
|1|Joueur|Connaître ses bateaux|Les placer sur le plateau de jeu|INVEST|  |
|6|Joueur|Placer un bateau|Initialiser la partie|INVEST|
|2|Joueur|Voir le plateau de jeu|Placer ses bateaux|INVEST|
|---|---|---|---|---|---|
|18| Adversaire | jouer après l'adversaire | alterner les joueurs | --VEST |
|23| joueur | attendre que l'adversaire joue | continuer la partie partie | -NV--T |
|3|joueur|Choisir le prochain coup|essayer de toucher l'adversaire|I-VEST|
|20| Joueur | Voir là où j'ai tiré | Choisir mon prochain tir | I-VEST |
|4|Joueur|Voir où a tiré l'adversaire|Savoir s'il touche un de mes bateaux|INV-ST|
|9|Joueur|Savoir si toutes les parties d'un bateau ont été touchées|Savoir si le bateau a été coulé|I-VEST|
|11|Joueur|Savoir si j'ai touché un bateau|Guider mes prochains coups|--VEST|
|19| Joueur | gagner un point lorsque je touche un bateau ennemi | gagner la partie | -NVEST |
|---|---|---|---|---|---|
|5|Spectateur|Voir les deux maps|Suivre le cours de la partie|I-VEST|
|8|Joueur|Ne pas voir le placement des bateaux de l'adversaire|Préserver le game-play|I-VEST|
|10|Joueur|Déterminer si tous les bateaux de l'adversaire sont coulés|savoir si j'ai gagné|--VEST|
|22|Joueur|Différencier si les tirs ont touché ou manqué un bateau adversaire, sur ma map|planifier mes prochains tours|-NVEST|
|Meta-parties|---|---|---|---|---|
|15|Joueur|Commencer une nouvelle série de partie|Remettre les scores à zéro|INVEST|
|14|Joueur|Voir le nombre de parties que j'ai gagnées ou perdues|Suivre mon score|INVEST|
|16|Joueur|quitter une partie en cours|**Ragequit** arrêter de jouer|INVEST|

### Troisième version : valeur métier et conditions d'acceptation

#### Valeur métier

| Id | En tant que ... | Je veux ... | Pour ... | Valeur métier |
|---|---|---|---|---|
|12|Joueur|Rejoindre une partie active|Jouer contre un adversaire||
|25| joueur | ne pas pouvoir rejoindre une partie déjà active | ne pas déranger la partie |  | 
|13|Joueur|attendre le bon nombre d'adversaire (0 ou 1)| pour commencer la partie||
|17|Spectateur|Rejoindre une partie en cours|Suivre le match||
|7|Joueur|Pouvoir sélectionner le nombre de joueurs |Choisir mon mode de jeu (vs IA ou Joueur)||
|21|Joueur|Pouvoir sélectionner la taille de la grille|Choisir la taille||
|---|---|---|---|---|---|
|1|Joueur|Connaître la liste de ses bateaux et leurs caractéristiques|Les placer sur le plateau de jeu|  |
|6|Joueur|Placer un bateau|Initialiser la partie||
|2|Joueur|Voir le plateau de jeu|Placer ses bateaux||
|---|---|---|---|---|---|
|18| Adversaire | jouer après joueur (ou l'IA) | alterner les joueurs ||
|3|joueur|Choisir le prochain coup|toucher l'adversaire||
|23| joueur | attendre que l'IA joue | continuer une partie sans adversaire |  |
|20| Joueur | Voir là où j'ai tiré | Choisir mon prochain tir |  |
|4|Joueur|Voir où a tiré l'adversaire|Savoir s'il touche un de mes bateaux||
|9|Joueur|Savoir si toutes les parties d'un bateau ont été touchées|Savoir si le bateau a été coulé||
|11|Joueur|Savoir si j'ai touché un bateau|Guider mes prochains coups||
|19| Joueur | gagner un point lorsque je touche un bateau ennemi | gagner la partie |  |
|---|---|---|---|---|---|
|5|Spectateur|Voir les deux maps|Suivre le cours de la partie||
|8|Joueur|Ne pas voir le placement des bateaux de l'adversaire|Préserver le game-play||
|10|Joueur|Déterminer si tous les bateaux de l'adversaire sont coulés|savoir si j'ai gagné||
|22|Joueur|Distinction tir touché ou manqué sur la map|Choisir mon prochain tir||
|Meta-parties|---|---|---|---|---|
|15|Joueur|Commencer une nouvelle série de partie|Remettre les scores à zéro||
|14|Joueur|Voir le nombre de parties que j'ai gagnées ou perdues|Suivre mon score||
|16|Joueur|quitter une partie en cours|**Ragequit** arrêter de jouer||

A la semaine prochaine
:3
#### Conditions d'acceptation

|Ref| Etant donné... | Quand... | Alors... |
|---|---|---|---|

Salut ! (Il fodra push)
