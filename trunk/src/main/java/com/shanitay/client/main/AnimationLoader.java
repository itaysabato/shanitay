package com.shanitay.client.main;

import com.shanitay.client.utils.SvgToyAnimation;
import com.shanitay.client.utils.Toy;
import org.vectomatic.dom.svg.OMSVGAnimationElement;

/**
 * Created By: Itay Sabato<br/>
 * Date: 17/05/12 <br/>
 * Time: 20:05 <br/>
 */
class AnimationLoader {
    private final ElementLoader elementLoader;

    final Toy.Animation slide;
    final Toy.Animation watchRight;
    final Toy.Animation igulSlide;
    final Toy.Animation orangeCube;
    final Toy.Animation blueCube;
    final Toy.Animation blackCube;
    final Toy.Animation yellowMiddleCube;
    final Toy.Animation house;
    final Toy.Animation blueTriangle;
    final Toy.Animation redLine;
    final Toy.Animation yellowLineDown;
    final Toy.Animation greenLineDown;
    final Toy.Animation pinkButton;
    final Toy.Animation redButton;
    final Toy.Animation igulColor;
    final Toy.Animation pinkLine;

    public AnimationLoader(ElementLoader elementLoader) {
        this.elementLoader = elementLoader;

        slide = createSlide();
        watchRight = createWatchRight();
        igulSlide = createIgulSlide();
        orangeCube = createOrangeCube();
        blueCube = createBlueCube();
        blackCube = createBlackCube();
        yellowMiddleCube = createYellowMiddleCube();
        house = createHouse();
        blueTriangle = createBlueTriangle();
        redLine = createRedLine();
        yellowLineDown = createYellowLineDown();
        greenLineDown = createGreenLineDown();
        pinkButton = createPinkButton();
        redButton = createRedButton();
        igulColor = createIgulColor();
        pinkLine = createPinkLine();
    }

    private Toy.Animation createSlide() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createWatchRight() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createIgulSlide() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createOrangeCube() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createBlueCube() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createBlackCube() {
        return getAnimation("moveBlackCube");
    }

    private Toy.Animation getAnimation(String elementId) {
        OMSVGAnimationElement animationElement = elementLoader.getAnimation(elementId);
        return new SvgToyAnimation(animationElement);
    }

    private Toy.Animation createYellowMiddleCube() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createHouse() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createBlueTriangle() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createRedLine() {
        return getAnimation("redLineMove");
    }

    private Toy.Animation createYellowLineDown() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createGreenLineDown() {
        return getAnimation("greenLineMove");
    }

    private Toy.Animation createPinkButton() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createRedButton() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createIgulColor() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private Toy.Animation createPinkLine() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}