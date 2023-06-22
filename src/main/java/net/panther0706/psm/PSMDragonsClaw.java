package net.panther0706.psm;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class PSMDragonsClaw extends SwordItem {
    public PSMDragonsClaw(Tier pTier, int pAttackDamageModifier, float pAttackSpeedMultiplier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedMultiplier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pAttacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,20));
        pAttacker.addEffect(new MobEffectInstance(MobEffects.REGENERATION,20));
        pAttacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,20));
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public Rarity getRarity(ItemStack p_41461_) {
        return Rarity.EPIC;
    }
}
