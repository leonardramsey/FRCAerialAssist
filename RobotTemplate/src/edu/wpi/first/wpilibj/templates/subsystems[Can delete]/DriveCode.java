/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
//where is this??? import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author RLR
 */
public abstract class DriveCode extends Subsystem {
    
    RobotDrive robotDrive = RobotMap.DRIVE_TRAIN_ROBOT_DRIVE;
    Jaguar rightMotor = RobotMap.DRIVE_TRAIN_RIGHT_MOTOR;
    Jaguar leftMotor = RobotMap.DRIVE_TRAIN_LEFT_MOTOR;
    
    
    public DriveCode() {
        // eg. requires(chassis);
    }

    public void takeJoysticksInput(Joystick left, Joystick right){
        robotDrive.tankDrive(left, right);
    }
    
    public void stop(){
        robotDrive.drive(0,0);
    }
}