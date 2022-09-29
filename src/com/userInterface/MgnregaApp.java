package com.userInterface;

import java.util.Scanner;

import com.bean.User;
import com.dao.UserInter;
import com.dao.UserInterImpl;
import com.exceptions.UserExcep;

public class MgnregaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserInter usi = new UserInterImpl();

		while (true) {

			System.out.println("**********welcome to MGNREGA application**********");
			System.out.println();

			System.out.println("press 1 for registration");
			System.out.println("press 2 for login ");
			System.out.println("press 3 for see the details by email");
			System.out.println("Do you want to exit Y/N");
			String decision = sc.next();

			if (decision.charAt(0) == '1') {

				System.out.println("Enter the first name : ");
				String fname = sc.next();

				System.out.println("Enter the last name : ");
				String lname = sc.next();

				System.out.println("Enter the email : ");
				String email = sc.next();

				System.out.println("Enter the  mobile : ");
				String mobile = sc.next();

				System.out.println("Enter the voter Id : ");
				String voterId = sc.next();

				System.out.println("Enter the ration Id: ");
				String rationId = sc.next();

				String aadhar = "";
				while (true) {
					System.out.println("Enter the Aadhar: ");
					aadhar = sc.next();
					if (aadhar.length() == 12) {
						break;
					} else {
						System.out.println("invalid aadhar number");
					}
				}
				System.out.println("Enter the PAN Card Number : ");
				String pan = sc.next();

				System.out.println("create password : ");
				String pass = sc.next();

				String res = usi.registerUser(fname, lname, email, mobile, voterId, rationId, aadhar, pan, pass);
				System.out.println(res);

			} else if (decision.charAt(0) == '2') {
				System.out.println("press 1 for login via email and 2 for mobile ");
				int x = sc.nextInt();

				if (x == 1) {
					System.out.println("Enter your email.....");
					String email = sc.next();

					System.out.println("Enter your password.....");
					String password = sc.next();

					try {
						String dd="";
						User result = usi.loginvviaemail(email, password);
						while (true) {
							System.out.println("**********Welcome" + " " + result.getFname() + " " + result.getLname()
									+ "********");
							System.out.println();
							System.out.println("press 1 for view your details...");
							System.out.println("press 2 for manage or update in your profile....");
							System.out.println("press 3 for Delete your account.....");
							System.out.println("do you want to exit from this section Y/N");

							 dd = sc.next();

							if (dd.charAt(0)=='1') {
								System.out.println("Your Name is -->> " + result.getFname() + " " + result.getLname());
								System.out.println("your registered email I'd is-->>" + result.getEmail());
								System.out.println("your registered mobile no. is-->>" + result.getMobile());
								System.out.println("your voter I'd no. is-->>" + result.getVoterId());
								System.out.println("your ratio card no. is-->>" + result.getRationId());
								System.out.println("your Aadhar no. is-->>" + result.getAadhar());
								System.out.println("your PAN card no. is-->>" + result.getPan());
								System.out.println("your password is -->>" + result.getPassword());

							} else if (dd.charAt(0)=='2') {
								System.out.println("what do you want to update......???");
								System.out.println("press 1 for mobile :-");
								System.out.println("press 2 for email :-");
								System.out.println("press 3 for password :-");
								System.out.println("press 4 for Aadhar No. :-");
								System.out.println("press 5 for first Name :-");
								int ww = sc.nextInt();

								if (ww == 1) {
									System.out.println("Enter new mobile no. :-");
									String mob = sc.next();

									System.out.println(usi.updateMobile(result.getEmail(), mob));

								} else if (ww == 2) {
									System.out.println("Enter new email. :-");
									String em = sc.next();

									System.out.println(usi.updateEmail(result.getMobile(), em));

								} else if (ww == 3) {
									System.out.println("Enter new password. :-");
									String pass = sc.next();
									System.out.println(usi.updatepassword(result.getEmail(), pass));

								} else if (ww == 4) {
									System.out.println("Enter new Aadhar no. :-");
									String aadhar = sc.next();

									System.out.println(usi.updateAadhar(result.getEmail(), aadhar));

								} else if (ww == 5) {
									System.out.println("Enter new First Name :-");
									String name = sc.next();

									System.out.println(usi.updateFirstName(result.getEmail(), name));

								} else {
									System.out.println("Invalid choice........");
								}

							} else if (dd.charAt(0)=='3') {

								System.out.println("Are you sure wanna delete your account ....?? (Y/N)");
								if(sc.next().charAt(0)=='Y'||sc.next().charAt(0)=='Y') {
							    System.out.println(usi.deleteUser(result.getEmail()));
							    break;
								}
								
							} else {
								System.out.println("Invalid Choice...");
							}
							
							if(dd.charAt(0)=='Y'||dd.charAt(0)=='y') {
								break;
							}
						}
						
						
					} catch (UserExcep e) {
						System.out.println(e.getMessage());
					}

				}

				else if (x == 2) {
					System.out.println("Enter your mobile.....");
					String mobile = sc.next();

					System.out.println("Enter your password.....");
					String password = sc.next();

					try {
						String dd="";
						User result = usi.loginvviamobile(mobile, password);
						while (true) {
							System.out.println("**********Welcome" + " " + result.getFname() + " " + result.getLname()
									+ "********");
							System.out.println();
							System.out.println("press 1 for view your details...");
							System.out.println("press 2 for manage or update in your profile....");
							System.out.println("press 3 for Delete your account.....");
							System.out.println("do you want to exit from this section Y/N");

							 dd = sc.next();

							if (dd.charAt(0)=='1') {
								System.out.println("Your Name is -->> " + result.getFname() + " " + result.getLname());
								System.out.println("your registered email I'd is-->>" + result.getEmail());
								System.out.println("your registered mobile no. is-->>" + result.getMobile());
								System.out.println("your voter I'd no. is-->>" + result.getVoterId());
								System.out.println("your ratio card no. is-->>" + result.getRationId());
								System.out.println("your Aadhar no. is-->>" + result.getAadhar());
								System.out.println("your PAN card no. is-->>" + result.getPan());
								System.out.println("your password is -->>" + result.getPassword());

							} else if (dd.charAt(0)=='2') {
								System.out.println("what do you want to update......???");
								System.out.println("press 1 for mobile :-");
								System.out.println("press 2 for email :-");
								System.out.println("press 3 for password :-");
								System.out.println("press 4 for Aadhar No. :-");
								System.out.println("press 5 for first Name :-");
								int ww = sc.nextInt();

								if (ww == 1) {
									System.out.println("Enter new mobile no. :-");
									String mob = sc.next();

									System.out.println(usi.updateMobile(result.getEmail(), mob));

								} else if (ww == 2) {
									System.out.println("Enter new email. :-");
									String em = sc.next();

									System.out.println(usi.updateEmail(result.getMobile(), em));

								} else if (ww == 3) {
									System.out.println("Enter new password. :-");
									String pass = sc.next();
									System.out.println(usi.updatepassword(result.getEmail(), pass));

								} else if (ww == 4) {
									System.out.println("Enter new Aadhar no. :-");
									String aadhar = sc.next();

									System.out.println(usi.updateAadhar(result.getEmail(), aadhar));

								} else if (ww == 5) {
									System.out.println("Enter new First Name :-");
									String name = sc.next();

									System.out.println(usi.updateFirstName(result.getEmail(), name));

								} else {
									System.out.println("Invalid choice........");
								}

							} else if (dd.charAt(0)=='3') {

								System.out.println("Are you sure wanna delete your account ....?? (Y/N)");
								if(sc.next().charAt(0)=='Y'||sc.next().charAt(0)=='Y') {
							    System.out.println(usi.deleteUser(result.getEmail()));
								}
								
							} else {
								System.out.println("Invalid Choice...");
							}
							
							if(dd.charAt(0)=='Y'||dd.charAt(0)=='y') {
								break;
							}
						}

					} catch (UserExcep e) {
						System.out.println(e.getMessage());
					}

				} else {
					System.out.println("invalid choice.........");
				}

			}
			if (decision.charAt(0) == 'Y' || decision.charAt(0) == 'y') {
				System.out.println("Thanks for visiting.........");
				break;
			}
		}

	}

}
