export type GamePlatform = 'XBOX' | 'PC' | 'PLASTATION';

export type Game = {
    id: number;
    title: string;
    platform: GamePlatform;
    label: string;
    value: number;    
};