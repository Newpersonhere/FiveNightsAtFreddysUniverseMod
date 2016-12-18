package link1234gamer.fnafmod.client.model.entity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGoldenFreddy extends ModelBase {
    public double[] modelScale = new double[] { 1.4D, 1.4D, 1.4D };
    public ModelRenderer Body;
    public ModelRenderer RightLeg1;
    public ModelRenderer LeftLeg1;
    public ModelRenderer Body2;
    public ModelRenderer ShoulderBase;
    public ModelRenderer Neck1;
    public ModelRenderer Hips;
    public ModelRenderer BowTie1;
    public ModelRenderer Hips2;
    public ModelRenderer BowRight1;
    public ModelRenderer BowLeft1;
    public ModelRenderer BowRight2;
    public ModelRenderer BowRight3;
    public ModelRenderer BowLeft2;
    public ModelRenderer BowLeft3;
    public ModelRenderer RightArm1;
    public ModelRenderer LeftArm1;
    public ModelRenderer RightArmCover1;
    public ModelRenderer RightArm2;
    public ModelRenderer RightShoulder;
    public ModelRenderer RightArmCover2;
    public ModelRenderer RightHand;
    public ModelRenderer RightThumb;
    public ModelRenderer RightFingers1;
    public ModelRenderer RightFingers1_1;
    public ModelRenderer RightFingers1_2;
    public ModelRenderer shape118;
    public ModelRenderer RightThumb_1;
    public ModelRenderer RightFingers2;
    public ModelRenderer RightFingers2_1;
    public ModelRenderer RightFingers2_2;
    public ModelRenderer RightFingers2_3;
    public ModelRenderer RightFingers2_4;
    public ModelRenderer RightFingers2_5;
    public ModelRenderer shape118_1;
    public ModelRenderer shape118_2;
    public ModelRenderer shape118_3;
    public ModelRenderer shape118_4;
    public ModelRenderer shape118_5;
    public ModelRenderer shape118_6;
    public ModelRenderer shape118_7;
    public ModelRenderer shape118_8;
    public ModelRenderer shape118_9;
    public ModelRenderer shape118_10;
    public ModelRenderer shape118_11;
    public ModelRenderer shape118_12;
    public ModelRenderer LeftArmCover1;
    public ModelRenderer LeftArm2;
    public ModelRenderer LeftShoulder;
    public ModelRenderer LeftArmCover2;
    public ModelRenderer LeftHand;
    public ModelRenderer LeftThumb;
    public ModelRenderer LeftFingers1;
    public ModelRenderer LeftFingers1_1;
    public ModelRenderer LeftFingers1_2;
    public ModelRenderer LeftThumb_1;
    public ModelRenderer LeftFingers2;
    public ModelRenderer LeftFingers2_1;
    public ModelRenderer LeftFingers2_2;
    public ModelRenderer LeftFingers2_3;
    public ModelRenderer LeftFingers2_4;
    public ModelRenderer LeftFingers2_5;
    public ModelRenderer Head1;
    public ModelRenderer Head2;
    public ModelRenderer Mask1;
    public ModelRenderer Mask2;
    public ModelRenderer LowerJaw1;
    public ModelRenderer Mask4;
    public ModelRenderer RightEar1;
    public ModelRenderer Mask5;
    public ModelRenderer Mask6;
    public ModelRenderer LeftEar1;
    public ModelRenderer Hat2;
    public ModelRenderer Hat3;
    public ModelRenderer LeftEar2;
    public ModelRenderer LeftEar3;
    public ModelRenderer LeftEar4;
    public ModelRenderer LeftEar5;
    public ModelRenderer LeftEar2_1;
    public ModelRenderer LeftEar3_1;
    public ModelRenderer LeftEar4_1;
    public ModelRenderer LeftEar5_1;
    public ModelRenderer Mask3;
    public ModelRenderer Nose;
    public ModelRenderer LowerMask1;
    public ModelRenderer LowerJaw3;
    public ModelRenderer LowerMask2;
    public ModelRenderer LowerTeeth1;
    public ModelRenderer LowerTeeth2;
    public ModelRenderer LowerTeeth3;
    public ModelRenderer LowerTeeth4;
    public ModelRenderer LowerTeeth5;
    public ModelRenderer LowerTeeth6;
    public ModelRenderer LowerTeeth7;
    public ModelRenderer LowerTeeth8;
    public ModelRenderer RightLegCover1;
    public ModelRenderer RightLeg2;
    public ModelRenderer RightKnee;
    public ModelRenderer RightLegCover2;
    public ModelRenderer RightFeet;
    public ModelRenderer RightToe1;
    public ModelRenderer RightToe2;
    public ModelRenderer RightToe3;
    public ModelRenderer RightFeet_1;
    public ModelRenderer RightFeet_2;
    public ModelRenderer LeftLegCover1;
    public ModelRenderer LeftLeg2;
    public ModelRenderer LeftKnee;
    public ModelRenderer LeftLegCover2;
    public ModelRenderer LeftFeet;
    public ModelRenderer LeftToe1;
    public ModelRenderer LeftToe2;
    public ModelRenderer LeftToe3;
    public ModelRenderer RightFeet_3;
    public ModelRenderer RightFeet_4;

    public ModelGoldenFreddy() {
        this.textureWidth = 258;
        this.textureHeight = 128;
        this.RightToe3 = new ModelRenderer(this, 80, 25);
        this.RightToe3.mirror = true;
        this.RightToe3.setRotationPoint(0.8F, -1.0F, -4.0F);
        this.RightToe3.addBox(0.0F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(RightToe3, 0.0F, -0.3815289744859604F, 0.0F);
        this.RightArm2 = new ModelRenderer(this, 0, 54);
        this.RightArm2.mirror = true;
        this.RightArm2.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.RightArm2.addBox(-1.5F, -1.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotateAngle(RightArm2, -0.38798669271833947F, -0.11920598791121272F, 0.3769911184307752F);
        this.Mask4 = new ModelRenderer(this, 223, 83);
        this.Mask4.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.Mask4.addBox(-4.5F, -0.5F, -6.5F, 9, 1, 8, 0.0F);
        this.LowerJaw1 = new ModelRenderer(this, 125, 117);
        this.LowerJaw1.setRotationPoint(0.0F, 0.4F, 2.0F);
        this.LowerJaw1.addBox(-3.0F, 0.0F, -7.0F, 6, 1, 8, 0.0F);
        this.setRotateAngle(LowerJaw1, 0.439822971502571F, 0.0F, 0.0F);
        this.RightEar1 = new ModelRenderer(this, 144, 57);
        this.RightEar1.setRotationPoint(-3.7F, 0.3F, -2.5F);
        this.RightEar1.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightEar1, 0.0F, 0.0F, -1.2292353921796064F);
        this.RightThumb = new ModelRenderer(this, 77, 52);
        this.RightThumb.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.RightThumb.addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(RightThumb, -0.3988077340807043F, -0.6784094802501959F, -0.6565928646002668F);
        this.RightFingers2_5 = new ModelRenderer(this, 67, 64);
        this.RightFingers2_5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.RightFingers2_5.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightFingers2_5, 0.0F, 0.0F, -0.439822971502571F);
        this.shape118_10 = new ModelRenderer(this, 40, 56);
        this.shape118_10.setRotationPoint(0.5F, -0.5F, 1.9F);
        this.shape118_10.addBox(0.0F, -0.5F, -1.0F, 2, 2, 1, 0.0F);
        this.RightFeet_3 = new ModelRenderer(this, 43, 40);
        this.RightFeet_3.setRotationPoint(-3.0F, -1.0F, 1.0F);
        this.RightFeet_3.addBox(0.0F, 0.0F, -6.0F, 2, 3, 6, 0.0F);
        this.setRotateAngle(RightFeet_3, 0.0F, 0.15079644737231007F, 0.0F);
        this.shape118_4 = new ModelRenderer(this, 0, 68);
        this.shape118_4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shape118_4.addBox(0.0F, -0.5F, -1.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(shape118_4, 0.0F, 0.025132741228718346F, 0.0F);
        this.Hips = new ModelRenderer(this, 1, 73);
        this.Hips.setRotationPoint(0.0F, 11.0F, -0.4F);
        this.Hips.addBox(-6.0F, -2.0F, -4.0F, 13, 4, 8, 0.0F);
        this.LeftKnee = new ModelRenderer(this, 97, 120);
        this.LeftKnee.setRotationPoint(0.0F, 11.7F, -0.5F);
        this.LeftKnee.addBox(-2.5F, -1.0F, -1.0F, 5, 3, 2, 0.0F);
        this.setRotateAngle(LeftKnee, 0.6283185307179586F, 0.0F, 0.0F);
        this.shape118 = new ModelRenderer(this, 0, 68);
        this.shape118.setRotationPoint(1.4285757108133943F, 3.7021475047043744F, -3.2466076560721024F);
        this.shape118.addBox(0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F);
        this.setRotateAngle(shape118, -2.985276571024237F, -1.2981508722997053F, -1.6966498332314333F);
        this.shape118_7 = new ModelRenderer(this, 39, 50);
        this.shape118_7.setRotationPoint(0.5F, -0.8F, 1.0F);
        this.shape118_7.addBox(0.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F);
        this.LeftEar4 = new ModelRenderer(this, 64, 11);
        this.LeftEar4.setRotationPoint(-2.0F, 0.5F, -0.2F);
        this.LeftEar4.addBox(0.0F, -1.5F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LeftEar4, 0.0F, 0.0F, 0.12566370614359174F);
        this.RightToe2 = new ModelRenderer(this, 80, 25);
        this.RightToe2.mirror = true;
        this.RightToe2.setRotationPoint(-0.8F, -1.0F, -4.0F);
        this.RightToe2.addBox(-3.0F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(RightToe2, 0.0F, 0.3815289744859604F, 0.0F);
        this.shape118_8 = new ModelRenderer(this, 39, 50);
        this.shape118_8.setRotationPoint(0.5F, 0.8F, 0.5F);
        this.shape118_8.addBox(0.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.LowerTeeth6 = new ModelRenderer(this, 186, 89);
        this.LowerTeeth6.setRotationPoint(1.9F, 0.4F, -1.9F);
        this.LowerTeeth6.addBox(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.Mask5 = new ModelRenderer(this, 153, 52);
        this.Mask5.setRotationPoint(-4.5F, 1.0F, 0.0F);
        this.Mask5.addBox(-0.5F, 0.0F, -6.5F, 2, 3, 7, 0.0F);
        this.Hat2 = new ModelRenderer(this, 194, 58);
        this.Hat2.setRotationPoint(0.0F, -0.5F, -2.5F);
        this.Hat2.addBox(-3.5F, -1.0F, -3.5F, 7, 1, 7, 0.0F);
        this.LeftArm2 = new ModelRenderer(this, 0, 54);
        this.LeftArm2.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.LeftArm2.addBox(-1.5F, -1.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotateAngle(LeftArm2, -0.18203784098300857F, 0.18203784098300857F, -0.25132741228718347F);
        this.LeftEar5 = new ModelRenderer(this, 64, 11);
        this.LeftEar5.setRotationPoint(0.0F, -0.3F, -0.1F);
        this.LeftEar5.addBox(-1.0F, -1.5F, -1.0F, 2, 1, 2, 0.0F);
        this.RightHand = new ModelRenderer(this, 62, 51);
        this.RightHand.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.RightHand.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 4, 0.0F);
        this.setRotateAngle(RightHand, 0.5654866776461628F, 2.7883380129861406F, 1.0854202618152735F);
        this.LeftEar1 = new ModelRenderer(this, 144, 57);
        this.LeftEar1.setRotationPoint(5.8F, 0.3F, -2.5F);
        this.LeftEar1.addBox(-0.4F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftEar1, 0.0F, 0.0F, 1.2292353921796064F);
        this.LeftFingers2_4 = new ModelRenderer(this, 67, 64);
        this.LeftFingers2_4.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LeftFingers2_4.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftFingers2_4, 0.0F, 0.0F, 0.3988077340807043F);
        this.RightLegCover1 = new ModelRenderer(this, 101, 87);
        this.RightLegCover1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightLegCover1.addBox(-3.5F, 0.0F, -3.0F, 7, 10, 6, 0.0F);
        this.Mask3 = new ModelRenderer(this, 154, 74);
        this.Mask3.setRotationPoint(-2.5F, 0.0F, -7.0F);
        this.Mask3.addBox(-1.0F, 0.0F, -3.0F, 11, 4, 3, 0.0F);
        this.LeftFingers1_1 = new ModelRenderer(this, 67, 64);
        this.LeftFingers1_1.setRotationPoint(0.5F, 4.0F, 0.0F);
        this.LeftFingers1_1.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftFingers1_1, 0.0F, 0.0F, 0.34243359924128747F);
        this.BowTie1 = new ModelRenderer(this, 131, 27);
        this.BowTie1.setRotationPoint(0.5F, -2.8F, -5.3F);
        this.BowTie1.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(BowTie1, -0.06283185307179587F, 0.0F, -0.12566370614359174F);
        this.RightFingers2_1 = new ModelRenderer(this, 67, 64);
        this.RightFingers2_1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.RightFingers2_1.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightFingers2_1, 0.0F, 0.0F, -0.25132741228718347F);
        this.LowerMask1 = new ModelRenderer(this, 180, 110);
        this.LowerMask1.setRotationPoint(-0.5F, 0.3F, 2.0F);
        this.LowerMask1.addBox(-5.0F, 0.0F, -8.0F, 11, 3, 7, 0.0F);
        this.LeftArm1 = new ModelRenderer(this, 0, 38);
        this.LeftArm1.setRotationPoint(9.0F, 0.0F, 0.0F);
        this.LeftArm1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotateAngle(LeftArm1, 0.1884955592153876F, -0.2448696940548044F, -0.07382742735936015F);
        this.Head2 = new ModelRenderer(this, 60, 73);
        this.Head2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head2.addBox(-5.5F, -3.0F, -3.1F, 11, 3, 6, 0.0F);
        this.Mask1 = new ModelRenderer(this, 190, 67);
        this.Mask1.mirror = true;
        this.Mask1.setRotationPoint(-1.0F, -8.0F, 2.0F);
        this.Mask1.addBox(-4.0F, -2.0F, -7.0F, 10, 6, 9, 0.0F);
        this.LeftEar2_1 = new ModelRenderer(this, 180, 47);
        this.LeftEar2_1.setRotationPoint(-0.5F, -2.6F, 0.0F);
        this.LeftEar2_1.addBox(-1.0F, -1.5F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(LeftEar2_1, 0.0F, 0.0F, 0.06283185307179587F);
        this.Neck1 = new ModelRenderer(this, 49, 101);
        this.Neck1.setRotationPoint(0.0F, -17.3F, 0.0F);
        this.Neck1.addBox(-2.0F, -5.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(Neck1, 0.5654866776461628F, -0.06283185307179587F, -0.439822971502571F);
        this.shape118_5 = new ModelRenderer(this, 0, 0);
        this.shape118_5.mirror = true;
        this.shape118_5.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.shape118_5.addBox(0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F);
        this.LowerTeeth3 = new ModelRenderer(this, 186, 89);
        this.LowerTeeth3.setRotationPoint(-3.3F, 0.4F, -1.5F);
        this.LowerTeeth3.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.RightKnee = new ModelRenderer(this, 97, 120);
        this.RightKnee.setRotationPoint(0.0F, 11.8F, -0.5F);
        this.RightKnee.addBox(-2.5F, -1.0F, -1.0F, 5, 3, 2, 0.0F);
        this.setRotateAngle(RightKnee, 0.6283185307179586F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 107, 0);
        this.Body.setRotationPoint(0.0F, 30.0F, 7.0F);
        this.Body.addBox(-4.5F, -17.0F, -3.0F, 9, 18, 6, 0.0F);
        this.LeftEar5_1 = new ModelRenderer(this, 64, 11);
        this.LeftEar5_1.setRotationPoint(0.5F, -0.3F, -0.1F);
        this.LeftEar5_1.addBox(-1.0F, -1.5F, -1.0F, 2, 1, 2, 0.0F);
        this.Nose = new ModelRenderer(this, 162, 69);
        this.Nose.setRotationPoint(4.5F, -0.5F, -2.7F);
        this.Nose.addBox(-2.0F, -0.3F, -0.2F, 4, 1, 2, 0.0F);
        this.RightThumb_1 = new ModelRenderer(this, 77, 52);
        this.RightThumb_1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.RightThumb_1.addBox(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightThumb_1, 0.6283185307179586F, 0.0F, 0.0F);
        this.BowLeft1 = new ModelRenderer(this, 112, 25);
        this.BowLeft1.setRotationPoint(4.05F, 0.0F, -0.8F);
        this.BowLeft1.addBox(-4.0F, -0.5F, 0.0F, 4, 1, 1, 0.0F);
        this.Body2 = new ModelRenderer(this, 0, 0);
        this.Body2.setRotationPoint(-0.5F, -11.1F, 0.4F);
        this.Body2.addBox(-6.5F, -6.5F, -5.5F, 14, 15, 10, 0.0F);
        this.ShoulderBase = new ModelRenderer(this, 40, 0);
        this.ShoulderBase.setRotationPoint(0.0F, -15.5F, 0.0F);
        this.ShoulderBase.addBox(-8.5F, -1.5F, -1.5F, 17, 3, 3, 0.0F);
        this.setRotateAngle(ShoulderBase, 0.0F, 0.045553093477052F, 0.0F);
        this.LowerTeeth7 = new ModelRenderer(this, 186, 89);
        this.LowerTeeth7.setRotationPoint(3.3F, 0.4F, -1.5F);
        this.LowerTeeth7.addBox(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.RightLegCover2 = new ModelRenderer(this, 96, 105);
        this.RightLegCover2.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.RightLegCover2.addBox(-3.0F, 0.0F, -2.5F, 6, 9, 5, 0.0F);
        this.LeftFingers1_2 = new ModelRenderer(this, 67, 64);
        this.LeftFingers1_2.setRotationPoint(0.5F, 4.0F, 1.5F);
        this.LeftFingers1_2.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftFingers1_2, 0.0F, 0.0F, 0.4052654523130833F);
        this.LeftFingers2 = new ModelRenderer(this, 67, 64);
        this.LeftFingers2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LeftFingers2.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftFingers2, 0.0F, 0.0F, 0.46163958715250014F);
        this.RightFeet_2 = new ModelRenderer(this, 43, 40);
        this.RightFeet_2.setRotationPoint(3.0F, -1.0F, 1.0F);
        this.RightFeet_2.addBox(-2.0F, 0.0F, -6.0F, 2, 3, 6, 0.0F);
        this.setRotateAngle(RightFeet_2, 0.0F, -0.15079644737231007F, 0.0F);
        this.Head1 = new ModelRenderer(this, 95, 67);
        this.Head1.setRotationPoint(-0.1F, -5.6F, -2.7F);
        this.Head1.addBox(-4.5F, -9.1F, -1.9F, 9, 9, 5, 0.0F);
        this.setRotateAngle(Head1, -0.5654866776461628F, -0.12566370614359174F, -0.06283185307179587F);
        this.RightShoulder = new ModelRenderer(this, 86, 0);
        this.RightShoulder.setRotationPoint(0.5F, -2.1F, 0.0F);
        this.RightShoulder.addBox(-4.0F, 0.0F, -2.5F, 5, 2, 5, 0.0F);
        this.setRotateAngle(RightShoulder, 0.0F, 0.0F, -0.3988077340807043F);
        this.LeftEar3 = new ModelRenderer(this, 63, 11);
        this.LeftEar3.setRotationPoint(2.0F, 0.5F, -0.2F);
        this.LeftEar3.addBox(-1.0F, -1.5F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LeftEar3, 0.0F, 0.0F, -0.12566370614359174F);
        this.RightToe1 = new ModelRenderer(this, 83, 34);
        this.RightToe1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.RightToe1.addBox(-1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.LeftFeet = new ModelRenderer(this, 43, 40);
        this.LeftFeet.setRotationPoint(-0.0015220672483329256F, 11.99895548647401F, 0.0F);
        this.LeftFeet.addBox(-3.0F, -1.0F, -4.0F, 6, 3, 6, 0.0F);
        this.setRotateAngle(LeftFeet, 0.6909431597173763F, -0.1884225203854555F, -0.08007612644364195F);
        this.LowerTeeth5 = new ModelRenderer(this, 187, 89);
        this.LowerTeeth5.setRotationPoint(0.5F, 0.4F, -1.9F);
        this.LowerTeeth5.addBox(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.RightFingers2 = new ModelRenderer(this, 67, 64);
        this.RightFingers2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.RightFingers2.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightFingers2, 0.0F, 0.0F, -0.3988077340807043F);
        this.Mask6 = new ModelRenderer(this, 153, 52);
        this.Mask6.setRotationPoint(5.5F, 1.0F, 0.0F);
        this.Mask6.addBox(-0.5F, 0.0F, -6.5F, 2, 3, 7, 0.0F);
        this.RightArmCover2 = new ModelRenderer(this, 46, 24);
        this.RightArmCover2.setRotationPoint(0.0F, 0.2F, 0.0F);
        this.RightArmCover2.addBox(-2.5F, 0.0F, -3.0F, 5, 8, 6, 0.0F);
        this.LeftHand = new ModelRenderer(this, 62, 51);
        this.LeftHand.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.LeftHand.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 4, 0.0F);
        this.setRotateAngle(LeftHand, 0.6911503837897545F, -3.039665425273324F, -1.1482521148870695F);
        this.RightArm1 = new ModelRenderer(this, 0, 38);
        this.RightArm1.setRotationPoint(-9.0F, 0.0F, 0.0F);
        this.RightArm1.addBox(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotateAngle(RightArm1, 0.09738937226128358F, -0.136659280431156F, 0.010995574287564275F);
        this.LeftFingers2_3 = new ModelRenderer(this, 67, 64);
        this.LeftFingers2_3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LeftFingers2_3.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftFingers2_3, 0.0F, 0.0F, 0.3141592653589793F);
        this.RightLeg1 = new ModelRenderer(this, 14, 37);
        this.RightLeg1.setRotationPoint(-3.7F, 31.1F, 6.1F);
        this.RightLeg1.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
        this.setRotateAngle(RightLeg1, -2.3876104167282426F, -0.01727875959474386F, 0.045553093477052F);
        this.LeftLegCover1 = new ModelRenderer(this, 101, 87);
        this.LeftLegCover1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftLegCover1.addBox(-3.5F, 0.0F, -3.0F, 7, 10, 6, 0.0F);
        this.RightFingers2_4 = new ModelRenderer(this, 67, 64);
        this.RightFingers2_4.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.RightFingers2_4.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightFingers2_4, 0.0F, 0.0F, -0.3988077340807043F);
        this.LeftShoulder = new ModelRenderer(this, 86, 0);
        this.LeftShoulder.mirror = true;
        this.LeftShoulder.setRotationPoint(-0.5F, -2.1F, 0.0F);
        this.LeftShoulder.addBox(-1.0F, 0.0F, -2.5F, 5, 2, 5, 0.0F);
        this.setRotateAngle(LeftShoulder, 0.0F, 0.0F, 0.46163958715250014F);
        this.LeftLeg2 = new ModelRenderer(this, 26, 51);
        this.LeftLeg2.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.LeftLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
        this.setRotateAngle(LeftLeg2, 1.6619025137490007F, -0.05026548245743669F, 0.0F);
        this.BowRight3 = new ModelRenderer(this, 112, 26);
        this.BowRight3.setRotationPoint(0.0F, 0.5F, 0.05F);
        this.BowRight3.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(BowRight3, 0.0F, 0.0F, -0.1884955592153876F);
        this.shape118_11 = new ModelRenderer(this, 47, 52);
        this.shape118_11.setRotationPoint(-0.3F, -0.5F, -1.0F);
        this.shape118_11.addBox(0.0F, -0.5F, 0.0F, 1, 2, 2, 0.0F);
        this.Mask2 = new ModelRenderer(this, 145, 86);
        this.Mask2.setRotationPoint(-2.0F, -4.0F, 2.0F);
        this.Mask2.addBox(-5.0F, 0.0F, -7.0F, 14, 4, 9, 0.0F);
        this.LeftFingers2_2 = new ModelRenderer(this, 67, 64);
        this.LeftFingers2_2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LeftFingers2_2.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftFingers2_2, 0.0F, 0.0F, 0.524471440224296F);
        this.BowRight2 = new ModelRenderer(this, 111, 26);
        this.BowRight2.setRotationPoint(0.0F, -0.5F, 0.05F);
        this.BowRight2.addBox(0.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(BowRight2, 0.0F, 0.0F, 0.1884955592153876F);
        this.shape118_12 = new ModelRenderer(this, 47, 52);
        this.shape118_12.setRotationPoint(3.3F, -0.5F, -1.0F);
        this.shape118_12.addBox(-1.0F, -0.5F, 0.0F, 1, 2, 2, 0.0F);
        this.shape118_2 = new ModelRenderer(this, 0, 68);
        this.shape118_2.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.shape118_2.addBox(0.0F, 0.0F, -1.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(shape118_2, 0.0F, 0.0F, -0.025132741228718346F);
        this.LeftEar4_1 = new ModelRenderer(this, 64, 11);
        this.LeftEar4_1.setRotationPoint(-1.6F, 0.5F, -0.2F);
        this.LeftEar4_1.addBox(0.0F, -1.5F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LeftEar4_1, 0.0F, 0.0F, 0.12566370614359174F);
        this.LeftLegCover2 = new ModelRenderer(this, 96, 105);
        this.LeftLegCover2.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.LeftLegCover2.addBox(-3.0F, 0.0F, -2.5F, 6, 9, 5, 0.0F);
        this.BowRight1 = new ModelRenderer(this, 112, 25);
        this.BowRight1.setRotationPoint(-4.05F, 0.0F, -0.8F);
        this.BowRight1.addBox(0.0F, -0.5F, 0.0F, 4, 1, 1, 0.0F);
        this.RightFeet_1 = new ModelRenderer(this, 43, 40);
        this.RightFeet_1.setRotationPoint(-3.0F, -1.0F, 1.0F);
        this.RightFeet_1.addBox(0.0F, 0.0F, -6.0F, 2, 3, 6, 0.0F);
        this.setRotateAngle(RightFeet_1, 0.0F, 0.15079644737231007F, 0.0F);
        this.RightFingers2_3 = new ModelRenderer(this, 67, 64);
        this.RightFingers2_3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.RightFingers2_3.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightFingers2_3, 0.0F, 0.0F, -0.12566370614359174F);
        this.RightFingers1 = new ModelRenderer(this, 67, 64);
        this.RightFingers1.setRotationPoint(-0.5F, 4.0F, -1.5F);
        this.RightFingers1.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightFingers1, 0.0F, 0.0F, -1.2220795422464295F);
        this.LeftFingers1 = new ModelRenderer(this, 67, 64);
        this.LeftFingers1.setRotationPoint(0.5F, 4.0F, -1.5F);
        this.LeftFingers1.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftFingers1, 0.0F, 0.0F, 0.4052654523130833F);
        this.BowLeft3 = new ModelRenderer(this, 112, 26);
        this.BowLeft3.setRotationPoint(0.0F, 0.5F, 0.05F);
        this.BowLeft3.addBox(-4.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(BowLeft3, 0.0F, 0.0F, 0.1884955592153876F);
        this.RightFeet = new ModelRenderer(this, 43, 40);
        this.RightFeet.setRotationPoint(-3.4735553422526877E-4F, 12.003736674583209F, 9.520383346632855E-4F);
        this.RightFeet.addBox(-3.0F, -1.0F, -4.0F, 6, 3, 6, 0.0F);
        this.setRotateAngle(RightFeet, 0.6658571248781213F, 0.18850444658819093F, 0.08007180590958035F);
        this.LeftThumb_1 = new ModelRenderer(this, 77, 52);
        this.LeftThumb_1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.LeftThumb_1.addBox(-1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftThumb_1, 0.3141592653589793F, 0.0F, 0.0F);
        this.RightLeg2 = new ModelRenderer(this, 26, 51);
        this.RightLeg2.setRotationPoint(0.0F, 12.0F, 0.0F);
        this.RightLeg2.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
        this.setRotateAngle(RightLeg2, 1.7247343668207962F, -0.03769911184307752F, 0.0F);
        this.LeftArmCover2 = new ModelRenderer(this, 46, 24);
        this.LeftArmCover2.mirror = true;
        this.LeftArmCover2.setRotationPoint(0.2F, 0.3F, 0.0F);
        this.LeftArmCover2.addBox(-2.5F, 0.0F, -3.0F, 5, 8, 6, 0.0F);
        this.setRotateAngle(LeftArmCover2, 0.0F, -0.091106186954104F, 0.045553093477052F);
        this.RightFingers1_2 = new ModelRenderer(this, 67, 64);
        this.RightFingers1_2.setRotationPoint(-0.5F, 4.0F, 1.5F);
        this.RightFingers1_2.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightFingers1_2, 0.0F, 0.0F, -1.2849113953182254F);
        this.LeftEar2 = new ModelRenderer(this, 180, 47);
        this.LeftEar2.setRotationPoint(0.0F, -2.6F, 0.0F);
        this.LeftEar2.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(LeftEar2, 0.0F, 0.0F, -0.06283185307179587F);
        this.LeftFingers2_1 = new ModelRenderer(this, 67, 64);
        this.LeftFingers2_1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LeftFingers2_1.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftFingers2_1, 0.0F, 0.0F, 0.3141592653589793F);
        this.LowerJaw3 = new ModelRenderer(this, 216, 113);
        this.LowerJaw3.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.LowerJaw3.addBox(-5.0F, -1.0F, -2.0F, 11, 3, 4, 0.0F);
        this.shape118_3 = new ModelRenderer(this, 0, 68);
        this.shape118_3.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.shape118_3.addBox(0.0F, -1.0F, -1.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(shape118_3, 0.0F, 0.0F, 0.025132741228718346F);
        this.shape118_9 = new ModelRenderer(this, 40, 56);
        this.shape118_9.setRotationPoint(0.5F, -0.5F, -1.9F);
        this.shape118_9.addBox(0.0F, -0.5F, 0.0F, 2, 2, 1, 0.0F);
        this.RightArmCover1 = new ModelRenderer(this, 56, 8);
        this.RightArmCover1.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.RightArmCover1.addBox(-3.0F, 0.0F, -3.5F, 6, 9, 7, 0.0F);
        this.Hips2 = new ModelRenderer(this, 7, 87);
        this.Hips2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Hips2.addBox(-2.0F, -2.0F, -3.5F, 5, 4, 7, 0.0F);
        this.Hat3 = new ModelRenderer(this, 197, 47);
        this.Hat3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Hat3.addBox(-2.5F, -3.5F, -2.5F, 5, 4, 5, 0.0F);
        this.LeftToe3 = new ModelRenderer(this, 80, 25);
        this.LeftToe3.mirror = true;
        this.LeftToe3.setRotationPoint(0.8F, -1.0F, -4.0F);
        this.LeftToe3.addBox(0.0F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(LeftToe3, 0.0F, -0.3815289744859604F, 0.0F);
        this.RightFeet_4 = new ModelRenderer(this, 43, 40);
        this.RightFeet_4.setRotationPoint(3.0F, -1.0F, 1.0F);
        this.RightFeet_4.addBox(-2.0F, 0.0F, -6.0F, 2, 3, 6, 0.0F);
        this.setRotateAngle(RightFeet_4, 0.0F, -0.15079644737231007F, 0.0F);
        this.shape118_6 = new ModelRenderer(this, 28, 42);
        this.shape118_6.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.shape118_6.addBox(0.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.RightFingers2_2 = new ModelRenderer(this, 67, 64);
        this.RightFingers2_2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.RightFingers2_2.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightFingers2_2, 0.0F, 0.0F, -0.6501351463678877F);
        this.LeftEar3_1 = new ModelRenderer(this, 64, 11);
        this.LeftEar3_1.setRotationPoint(2.5F, 0.5F, -0.2F);
        this.LeftEar3_1.addBox(-1.0F, -1.5F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(LeftEar3_1, 0.0F, 0.0F, -0.12566370614359174F);
        this.LeftToe1 = new ModelRenderer(this, 83, 34);
        this.LeftToe1.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.LeftToe1.addBox(-1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.LeftToe2 = new ModelRenderer(this, 80, 25);
        this.LeftToe2.setRotationPoint(-0.8F, -1.0F, -4.0F);
        this.LeftToe2.addBox(-3.0F, 0.0F, -3.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(LeftToe2, 0.0F, 0.3815289744859604F, 0.0F);
        this.LowerTeeth2 = new ModelRenderer(this, 186, 89);
        this.LowerTeeth2.setRotationPoint(-1.9F, 0.4F, -1.9F);
        this.LowerTeeth2.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.LowerTeeth1 = new ModelRenderer(this, 186, 89);
        this.LowerTeeth1.setRotationPoint(-0.5F, 0.4F, -1.9F);
        this.LowerTeeth1.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.LeftThumb = new ModelRenderer(this, 77, 52);
        this.LeftThumb.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.LeftThumb.addBox(-1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LeftThumb, -0.27314402793711257F, 0.36425021489121656F, 0.27960174616949157F);
        this.LowerMask2 = new ModelRenderer(this, 154, 114);
        this.LowerMask2.setRotationPoint(0.5F, 0.0F, -8.0F);
        this.LowerMask2.addBox(-5.0F, 0.0F, -3.0F, 10, 3, 3, 0.0F);
        this.BowLeft2 = new ModelRenderer(this, 112, 26);
        this.BowLeft2.setRotationPoint(0.0F, -0.5F, 0.05F);
        this.BowLeft2.addBox(-4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F);
        this.setRotateAngle(BowLeft2, 0.0F, 0.0F, -0.1884955592153876F);
        this.shape118_1 = new ModelRenderer(this, 0, 68);
        this.shape118_1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shape118_1.addBox(0.0F, -0.5F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(shape118_1, 0.0F, -0.025132741228718346F, 0.0F);
        this.RightFingers1_1 = new ModelRenderer(this, 67, 64);
        this.RightFingers1_1.setRotationPoint(-0.5F, 4.0F, 0.0F);
        this.RightFingers1_1.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightFingers1_1, 0.0F, 0.0F, -1.0964158361028378F);
        this.LeftFingers2_5 = new ModelRenderer(this, 67, 64);
        this.LeftFingers2_5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.LeftFingers2_5.addBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftFingers2_5, 0.0F, 0.0F, 0.3141592653589793F);
        this.LowerTeeth4 = new ModelRenderer(this, 186, 89);
        this.LowerTeeth4.setRotationPoint(-3.6F, 0.4F, -0.3F);
        this.LowerTeeth4.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.LeftArmCover1 = new ModelRenderer(this, 56, 8);
        this.LeftArmCover1.mirror = true;
        this.LeftArmCover1.setRotationPoint(0.0F, 0.8F, 0.0F);
        this.LeftArmCover1.addBox(-3.0F, 0.0F, -3.5F, 6, 9, 7, 0.0F);
        this.LowerTeeth8 = new ModelRenderer(this, 186, 89);
        this.LowerTeeth8.setRotationPoint(3.6F, 0.4F, -0.3F);
        this.LowerTeeth8.addBox(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.LeftLeg1 = new ModelRenderer(this, 14, 37);
        this.LeftLeg1.setRotationPoint(3.7F, 31.1F, 6.1F);
        this.LeftLeg1.addBox(-1.5F, 0.0F, -1.5F, 3, 12, 3, 0.0F);
        this.setRotateAngle(LeftLeg1, -2.3528783646135554F, -0.028274333882308142F, -0.10838494654884787F);
        this.RightFeet.addChild(this.RightToe3);
        this.RightArm1.addChild(this.RightArm2);
        this.Mask1.addChild(this.Mask4);
        this.Head1.addChild(this.LowerJaw1);
        this.Mask1.addChild(this.RightEar1);
        this.RightHand.addChild(this.RightThumb);
        this.RightFingers2_4.addChild(this.RightFingers2_5);
        this.shape118_6.addChild(this.shape118_10);
        this.LeftFeet.addChild(this.RightFeet_3);
        this.shape118.addChild(this.shape118_4);
        this.Body2.addChild(this.Hips);
        this.LeftLeg1.addChild(this.LeftKnee);
        this.RightHand.addChild(this.shape118);
        this.shape118_6.addChild(this.shape118_7);
        this.LeftEar2.addChild(this.LeftEar4);
        this.RightFeet.addChild(this.RightToe2);
        this.shape118_6.addChild(this.shape118_8);
        this.LowerMask2.addChild(this.LowerTeeth6);
        this.Mask1.addChild(this.Mask5);
        this.Mask4.addChild(this.Hat2);
        this.LeftArm1.addChild(this.LeftArm2);
        this.LeftEar2.addChild(this.LeftEar5);
        this.RightArm2.addChild(this.RightHand);
        this.Mask1.addChild(this.LeftEar1);
        this.LeftFingers1_2.addChild(this.LeftFingers2_4);
        this.RightLeg1.addChild(this.RightLegCover1);
        this.Mask2.addChild(this.Mask3);
        this.LeftHand.addChild(this.LeftFingers1_1);
        this.Body2.addChild(this.BowTie1);
        this.RightFingers2.addChild(this.RightFingers2_1);
        this.LowerJaw1.addChild(this.LowerMask1);
        this.ShoulderBase.addChild(this.LeftArm1);
        this.Head1.addChild(this.Head2);
        this.Head1.addChild(this.Mask1);
        this.LeftEar1.addChild(this.LeftEar2_1);
        this.Body.addChild(this.Neck1);
        this.shape118.addChild(this.shape118_5);
        this.LowerMask2.addChild(this.LowerTeeth3);
        this.RightLeg1.addChild(this.RightKnee);
        this.LeftEar2_1.addChild(this.LeftEar5_1);
        this.Mask3.addChild(this.Nose);
        this.RightThumb.addChild(this.RightThumb_1);
        this.BowTie1.addChild(this.BowLeft1);
        this.Body.addChild(this.Body2);
        this.Body.addChild(this.ShoulderBase);
        this.LowerMask2.addChild(this.LowerTeeth7);
        this.RightLeg2.addChild(this.RightLegCover2);
        this.LeftHand.addChild(this.LeftFingers1_2);
        this.LeftFingers1.addChild(this.LeftFingers2);
        this.RightFeet.addChild(this.RightFeet_2);
        this.Neck1.addChild(this.Head1);
        this.RightArm1.addChild(this.RightShoulder);
        this.LeftEar2.addChild(this.LeftEar3);
        this.RightFeet.addChild(this.RightToe1);
        this.LeftLeg2.addChild(this.LeftFeet);
        this.LowerMask2.addChild(this.LowerTeeth5);
        this.RightFingers1.addChild(this.RightFingers2);
        this.Mask1.addChild(this.Mask6);
        this.RightArm2.addChild(this.RightArmCover2);
        this.LeftArm2.addChild(this.LeftHand);
        this.ShoulderBase.addChild(this.RightArm1);
        this.LeftFingers2_2.addChild(this.LeftFingers2_3);
        this.LeftLeg1.addChild(this.LeftLegCover1);
        this.RightFingers1_2.addChild(this.RightFingers2_4);
        this.LeftArm1.addChild(this.LeftShoulder);
        this.LeftLeg1.addChild(this.LeftLeg2);
        this.BowRight1.addChild(this.BowRight3);
        this.shape118_6.addChild(this.shape118_11);
        this.Head1.addChild(this.Mask2);
        this.LeftFingers1_1.addChild(this.LeftFingers2_2);
        this.BowRight1.addChild(this.BowRight2);
        this.shape118_6.addChild(this.shape118_12);
        this.shape118.addChild(this.shape118_2);
        this.LeftEar2_1.addChild(this.LeftEar4_1);
        this.LeftLeg2.addChild(this.LeftLegCover2);
        this.BowTie1.addChild(this.BowRight1);
        this.RightFeet.addChild(this.RightFeet_1);
        this.RightFingers2_2.addChild(this.RightFingers2_3);
        this.RightHand.addChild(this.RightFingers1);
        this.LeftHand.addChild(this.LeftFingers1);
        this.BowLeft1.addChild(this.BowLeft3);
        this.RightLeg2.addChild(this.RightFeet);
        this.LeftThumb.addChild(this.LeftThumb_1);
        this.RightLeg1.addChild(this.RightLeg2);
        this.LeftArm2.addChild(this.LeftArmCover2);
        this.RightHand.addChild(this.RightFingers1_2);
        this.RightEar1.addChild(this.LeftEar2);
        this.LeftFingers2.addChild(this.LeftFingers2_1);
        this.LowerJaw1.addChild(this.LowerJaw3);
        this.shape118.addChild(this.shape118_3);
        this.shape118_6.addChild(this.shape118_9);
        this.RightArm1.addChild(this.RightArmCover1);
        this.Hips.addChild(this.Hips2);
        this.Hat2.addChild(this.Hat3);
        this.LeftFeet.addChild(this.LeftToe3);
        this.LeftFeet.addChild(this.RightFeet_4);
        this.shape118.addChild(this.shape118_6);
        this.RightFingers1_1.addChild(this.RightFingers2_2);
        this.LeftEar2_1.addChild(this.LeftEar3_1);
        this.LeftFeet.addChild(this.LeftToe1);
        this.LeftFeet.addChild(this.LeftToe2);
        this.LowerMask2.addChild(this.LowerTeeth2);
        this.LowerMask2.addChild(this.LowerTeeth1);
        this.LeftHand.addChild(this.LeftThumb);
        this.LowerMask1.addChild(this.LowerMask2);
        this.BowLeft1.addChild(this.BowLeft2);
        this.shape118.addChild(this.shape118_1);
        this.RightHand.addChild(this.RightFingers1_1);
        this.LeftFingers2_4.addChild(this.LeftFingers2_5);
        this.LowerMask2.addChild(this.LowerTeeth4);
        this.LeftArm1.addChild(this.LeftArmCover1);
        this.LowerMask2.addChild(this.LowerTeeth8);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GL11.glPushMatrix();
        GL11.glScaled(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        this.Body.render(f5);
        this.RightLeg1.render(f5);
        this.LeftLeg1.render(f5);
        GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

