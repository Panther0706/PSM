package net.panther0706.psm;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;

public class PSMFlameberge extends SwordItem {
    public PSMFlameberge(Tier pTier, int pAttackDamageModifier, float pAttackSpeedMultiplier, Item.Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedMultiplier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pAttacker.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,100));
        pTarget.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200));
        pTarget.setSecondsOnFire(10);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public Rarity getRarity(ItemStack p_41461_) {
        return Rarity.EPIC;
    }
}
